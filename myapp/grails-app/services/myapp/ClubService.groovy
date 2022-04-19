package myapp

import grails.gorm.transactions.Transactional
import grails.web.servlet.mvc.GrailsParameterMap

@Transactional
class ClubService {

    def createMember(GrailsParameterMap params) {
        Club club = new Club()
        club.id = params.id
        club.clubName = params.clubName
        club.city = params.city
        def date = new Date()
        club.establishedDate = params.establishedDate
        club.noOfOwners = params.noOfOwners
        if(club.validate()){
            club.save()
        }
    }
}
