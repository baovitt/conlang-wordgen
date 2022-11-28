package langgen

type Character = String

object Vowel:
  val conjunctionHead, `ä`: Character = 'ä'.toString
  val nounHead, `y`: Character = 'y'.toString
  val miscHead, `ɘ`: Character = 'ɘ'.toString

  val all: Array[Character] = Array(`ä`, `y`, `ɘ`)

object Consonant:
  val `ʔ`: Character = 0x0294.toChar.toString
  val `ʡ̆`: Character = 0x02A1.toChar.toString
  val `ʢ`: Character = 0x02A2.toChar.toString
  val `h`: Character = 'h'.toString
  val `ʟ̠`: Character = "ʟ̠"
  val `ħ`: Character = 0x0127.toChar.toString
  val `ʟ̝̊`: Character = "ʟ̝̊"
  val `ʦ’`: Character = "ʦ’"
  val `ɠ`: Character = 0x0260.toChar.toString

  val all: Array[Character] = Array(
    `ʔ`, `ʡ̆`, `ʢ`, `h`, `ʟ̠`, `ħ`, `ʟ̝̊`, `ʦ’`, `ɠ`
  )

object Character:
    import Consonant.*
    import Vowel.*

    val charSets: Map[Byte, String] = Map(
        1.toByte -> (`ä` + `ʔ`),
        2.toByte -> (`ä` + `ʡ̆`),
        3.toByte -> (`ä` + `ʢ`),
        4.toByte -> (`ä` + `h`),
        5.toByte -> (`ä` + `ʟ̠`),
        6.toByte -> (`ä` + `ħ`),
        7.toByte -> (`ä` + `ʟ̝̊`),
        8.toByte -> (`ä` + `ʦ’`),
        9.toByte -> (`ä` + `ɠ`),
        10.toByte -> (`y` + `ʔ`),
        11.toByte -> (`y` + `ʡ̆`),
        12.toByte -> (`y` + `ʢ`),
        13.toByte -> (`y` + `h`),
        14.toByte -> (`y` + `ʟ̠`),
        15.toByte -> (`y` + `ħ`),
        16.toByte -> (`y` + `ʟ̝̊`),
        17.toByte -> (`y` + `ʦ’`),
        18.toByte -> (`y` + `ɠ`),
        19.toByte -> (`ɘ` + `ʔ`),
        20.toByte -> (`ɘ` + `ʡ̆`),
        21.toByte -> (`ɘ` + `ʢ`),
        22.toByte -> (`ɘ` + `h`),
        23.toByte -> (`ɘ` + `ʟ̠`),
        24.toByte -> (`ɘ` + `ħ`),
        25.toByte -> (`ɘ` + `ʟ̝̊`),
        26.toByte -> (`ɘ` + `ʦ’`),
        27.toByte -> (`ɘ` + `ɠ`)
    )