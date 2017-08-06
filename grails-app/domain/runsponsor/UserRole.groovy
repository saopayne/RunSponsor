package runsponsor

/**
 * @author Oyewale Ademola
 * <saopayne[at]gmail.com>
 */
class UserRole {

    Role role
    User user

    static constraints = {
        role(nullable: false, blank: false)
        user(nullable: false, blank: false)
    }

    @Override
    String toString() {
        return "The user: $user has role: $role"
    }
}
