package com.loquor.jianzhioffer.no1to10

/**
 * <p>
 *
 * </p>
 *
 * @author zhengzhicong
 * @since 2021/8/8 1:57 下午
 */
object No2 {

  def main(args: Array[String]): Unit = {
    val s = "We are happy"
    val str: String = replace(s)
    println(str)
  }

  def replace(s: String): String = {
    val builder = new StringBuilder()
    s.foreach(c => {
      if (c == ' '){
        builder.append('%').append('2').append('0')
      }else{
        builder.append(c)
      }
    })
    builder.toString()
  }
}