import java.util.regex.Matcher
import java.util.regex.Pattern

fun main() {


    print(extractYTId("https://youtu.be/-0WEaUo1DCU"))
}
fun extractYTId(ytUrl: String?): String? {
    var vId: String? = null
    val pattern = Pattern.compile("http(?:s)?:\\/\\/(?:m.)?(?:www\\.)?youtu(?:\\.be\\/|be\\.com\\/(?:watch\\?(?:feature=youtu.be\\&)?v=|v\\/|embed\\/|user\\/(?:[\\w#]+\\/)+))([^&#?\\n]+)",Pattern.CASE_INSENSITIVE)
    val matcher: Matcher = pattern.matcher(ytUrl)
    if (matcher.matches()) {
        vId = matcher.group(1)
    }
    return vId
}
