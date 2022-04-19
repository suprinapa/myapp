package myapp


class MemberController {

    MemberService memberService
    def index() {
        def response = memberService.list(params)
        [memberList: response.list]
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
        [response:response]
        flash.message = AppUtil.infoMessage("Created",true)
        redirect(controller: "member", action: "index")
    }
}
