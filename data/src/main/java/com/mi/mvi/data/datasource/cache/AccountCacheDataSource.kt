package com.mi.mvi.data.datasource.cache

import com.mi.mvi.data.entity.UserEntity

interface AccountCacheDataSource {

    suspend fun insertOrIgnore(userEntity: UserEntity): Long

    suspend fun searchByPk(pk: Int): UserEntity?

    suspend fun searchByEmail(email: String): UserEntity?

    suspend fun updateAccountProperties(pk: Int, email: String?, username: String?)

    fun getLoggedInEmail(): String?

    fun saveLoggedInEmail(email: String?)
}
