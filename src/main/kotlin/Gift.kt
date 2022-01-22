// Объект, описывающий подарок
data class Gift(
    val id : Int, // Идентификатор подарка.
    val thumb_256 : String, // URL изображения 256x256px.
    val thumb_96 : String, // URL изображения 96x96px.
    val thumb_48 : String // URL изображения 48x48px.
)
