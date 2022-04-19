package myapp

class Club {

    Integer id
    String clubName
    String city
    Date establishedDate
    Integer noOfOwners

    static constraints = {
        clubName nullable: false, maxSize: 15
        city nullable: true, maxSize: 15
        establishedDate nullable: true
        noOfOwners nullable: false
    }
    static mapping = {
        table 'club'
        version false
        noOfOwners column: 'numberOfOwners'
        establishedDate column: 'establishedDate'
        clubName column: 'clubName'
        city column: 'city'
        id column: 'clubId',insertable: false, updateable: false
    }
}
