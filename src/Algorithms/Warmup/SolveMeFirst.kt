package Algorithms.Warmup

import java.util.*

fun main(args: Array<String>){

    val input = Scanner(System.`in`)
    val a : Int = input.nextInt()
    val b : Int = input.nextInt()

    print(solve(a,b))
}

fun solve(a: Int, b: Int): Int = a +b