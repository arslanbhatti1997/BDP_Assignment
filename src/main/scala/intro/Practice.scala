package intro

/**
  * This part has some exercises for you to practice with the recursive lists and functions.
  * For the exercises in this part you are _not_ allowed to use library functions,
  * you should implement everything yourself.
  * Use recursion to process lists, iteration is not allowed.
  *
  * This part is worth 5 points.
  */
object Practice {

    /** Q5 (2p)
      * Implement the function that returns the first n elements from the list.
      * Note that `n` is an upper bound, the list might not have `n` elements.
      *
      * @param xs list to take items from.
      * @param n amount of items to take.
      * @return the first n items of xs.
      */
    def firstN(xs: List[Int], n: Int): List[Int] = {
        xs match {
            case head::tail =>
                if (n == 0) List[Int]()
                else  head +: firstN(tail, n-1)
            case Nil => List[Int]()
        }
    }


    /** Q6 (3p)
      * Implement the function that returns the maximum value in the list.
      * If the list is empty, return `Int.MinValue`
      *
      * @param xs list to process.
      * @return the maximum value in the list.
      */
    def maxValue(xs: List[Int]): Int = {
        var max = 0
        xs match {
            case head::tail =>
            max = head
            if(max > maxValue(tail)) {
                max = head
            }else{
                max = maxValue(tail)
            }
            case Nil => max = Int.MinValue
        }
        max
    }
}