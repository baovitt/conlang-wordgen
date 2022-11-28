package langgen

import scala.collection.immutable.ArraySeq
import scala.collection.mutable

object Words:
    sealed trait WordSet:
        def words: Set[Word]
    end WordSet

    case class ItAndChildrenOf(word: Word) extends WordSet:
        def words: Set[Word] = Words().down(word.word*).subWords.toSet + word
    end ItAndChildrenOf

    case class IndexSwitch(index: Byte)(word: Byte*) extends WordSet:
        def words: Set[Word] = ???
    end IndexSwitch

    case class ConsonantRotation(index: Byte)(word: Byte*) extends WordSet:
        def words: Set[Word] = ???
    end ConsonantRotation

    case class VowelRotation(index: Byte)(word: Byte*) extends WordSet:
        def words: Set[Word] = ???
    end VowelRotation

    case class ByteRotation(index: Byte)(word: Byte*) extends WordSet:
        def words: Set[Word] = ???
    end ByteRotation

    final case class Word(word: Byte*):
        val subWords: Seq[Word] = 
            word.length match 
                case 4 => Seq.empty
                case _ => for (i <- 1 to 27) yield (Word((word :+ i.toByte)*))

        // Navigates to downward Words in the tree
        @scala.annotation.tailrec
        def down(directional: Byte*): Word = 
            if directional.isEmpty then
                this
            else
                subWords(directional.head - 1).down(directional.tail*)

        // Navigates to upward Words in the tree
        def up(amount: Int): Word = 
            words.down(word.take(word.length - amount)*)

        def toWord: String = this.word.map(Character.charSets(_)).mkString

    end Word

    private val words: Word = Word()

    inline def apply() = words

end Words