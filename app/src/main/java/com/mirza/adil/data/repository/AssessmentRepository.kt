package com.techvista.nytimes.data.repository


import com.mirza.adil.data.remote.AssessmentService
import javax.inject.Inject

/*
* The class NewsRepository
*
* @author  Mirza Adil
* @email mirza.adil@gmail.com
* @version 1.0
* @since 14 Jul 2021
*
* This class is used to hold news data operations and conditions
*/
class AssessmentRepository @Inject constructor(
    private val nyService: AssessmentService,
) {
    //suspend fun getNews() = nyService.getNews()
}