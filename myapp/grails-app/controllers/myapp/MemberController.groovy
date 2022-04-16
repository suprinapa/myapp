package myapp


class MemberController {

    MemberService memberService
    def index() {
        def response = memberService.listMembers()
        def res2 = response
        [memberList: response]
        //render response.size();

    }
    def create(params){
        def response = memberService.create(params)
        return response
    }
    def update(params){

        def response = memberService.update(params)
        return response

    }

    def delete(params){
        def response = memberService.delete(params)
        return response
    }
}
