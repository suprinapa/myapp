package myapp

class ClubController {

    ClubService clubService

    def index() {
        def response = Club.list()
        [list: response]
    }

    def createMember(params){
    def response = clubService.createMember(params)
    [response:response]
    }


}
