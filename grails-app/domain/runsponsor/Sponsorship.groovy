package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Sponsorship {

    Event event
    Sponsor sponsor
    String contributionType
    String description
    String notes
    String organizerMessage
    String sponsorMessage
    boolean sponsorApproved = false
    boolean organizerApproved = false
    Date dateCreated

    static constraints = {
        event(nullable:false)
        sponsor(nullable:false)
        contributionType(blank: true, inList:["Other", "Venue", "A/V", "Promotion", "Cash"], nullable:true)
        description(nullable:true, blank:true)
        notes(nullable:true, blank:true, maxSize:5000)
        organizerMessage(blank:true, nullable:true)
        sponsorMessage(blank:true, nullable:true)
        sponsorApproved()
        organizerApproved()
        dateCreated(nullable:true, blank:true)
    }
}
