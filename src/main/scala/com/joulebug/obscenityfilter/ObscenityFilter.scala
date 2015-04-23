package com.joulebug.obscenityfilter

/**
 * Created by josephelliott on 4/23/15.
 */
object ObscenityFilter {


  def profanityExists(phraseToFilter:String):Boolean = {

    val lowercasePhrase = phraseToFilter.toLowerCase()
    WordList.en.exists(badWord=>{

      val string = "\\b" + badWord + "\\b"
      val regex = string.r
      (regex findAllIn lowercasePhrase).nonEmpty
    })

  }

  //TODO:
  //Account for l33t-speak and txt-speak
  //Strip out punctuation and spaces to look for words
  //Use natural language (ass, asses, etc)
}
