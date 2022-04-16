package myapp

class Member {

    Integer id
    String name
    String address

    static constraints = {
        name nullable: false, maxSize: 15
        address nullable: true, maxSize: 15
    }

    static mapping = {
        table 'member'
        version true
        name column: 'name'
        address column: 'address'
        id column: 'id',insertable: false, updateable: false
    }
}
