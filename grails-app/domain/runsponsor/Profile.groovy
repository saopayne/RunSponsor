package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class Profile {
    String fullName
    String websiteUrl
    String shortBio
    String email

    boolean showEmail
    boolean showFullName

    static belongsTo = [user: User]

    static constraints = {
        fullName(nullable: true, blank: true)
        websiteUrl(nullable: true, blank: true)
        shortBio(nullable: true, maxSize: 1000)
    }

    @Override
    String toString() {
        return fullName
    }
}
