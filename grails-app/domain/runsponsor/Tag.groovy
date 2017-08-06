package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Tag {

    String name

    static hasMany = [events: Event, sponsors: Sponsor]
    static belongsTo = [Event, Sponsor]

    static searchable = true

    static constraints = {
        events(nullable:true)
        sponsors(nullable:true)
    }

    @Override
    String toString() {
        return name
    }

}
