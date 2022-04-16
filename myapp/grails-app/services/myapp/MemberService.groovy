package myapp

import grails.gorm.transactions.Transactional
import grails.web.servlet.mvc.GrailsParameterMap

@Transactional
class MemberService {

    def listMembers() {
        List<Member> memberList = Member.list();
        return memberList
    }

    def create(GrailsParameterMap params){
        Member member = new Member(params)
        member.get(params.id)
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
