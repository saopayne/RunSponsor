package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Role {

    static hasMany = [users: User]

    /** description */
    String description
    /** ROLE String */
    String authority

    static constraints = {
        authority(blank: false, unique: true)
        description()
    }
}
