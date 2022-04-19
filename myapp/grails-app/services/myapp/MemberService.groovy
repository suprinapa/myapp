package myapp

import grails.web.servlet.mvc.GrailsParameterMap

class MemberService {

    def list(GrailsParameterMap params) {
        params.max = params.max ?: 10
        //Creates and returns an instance of HibernateCriteriaBuilder that can be used to construct criteria queries
        List<Member> memberList = Member.createCriteria().list(params) {
            if (params?.colName && params?.colValue) {
                like(params.colName, "%" + params.colValue + "%")
            }
            if (!params.sort) {
                order("name", "asc")
            }
        }
        return [list: memberList]
    }

    def create(GrailsParameterMap params){
        Member member = new Member(params)
        member.id = params.id
        member.name= params.name
        member.address= params.address
        if (member.validate()) {
            member.save(params)
        }
    }

    def update(GrailsParameterMap params){
        // retrieve the members from the database
        def member = Member.get(params.id)
        // update properties in the employee
        member.name = params.name
        member.address = params.address
        // update the database
            member.save()
    }


    def delete(params){
        def member = Member.get(params.id)
    try {
        member.delete()
    } catch (Exception e) {
        println(e.getMessage())
        return false
    }
    return true
}
}
