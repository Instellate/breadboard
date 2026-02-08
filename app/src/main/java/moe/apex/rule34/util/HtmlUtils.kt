package moe.apex.rule34.util

import androidx.core.text.HtmlCompat

fun String.decodeHtml(): String {
    return HtmlCompat.fromHtml(this, HtmlCompat.FROM_HTML_MODE_LEGACY).toString()
}
