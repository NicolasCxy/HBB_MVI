/*
 * Copyright (c) 2020. vipyinzhiwei <vipyinzhiwei@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hbb.mvi.logic.bean

import com.flyco.tablayout.listener.CustomTabEntity

/**
 * 与CommonTabLayout搭配使用的实体类。
 *
 * @author vipyinzhiwei
 * @since  2020/5/10
 */
class TabEntity(private val title: String, private val selectedIcon: Int = 0, private val unSelectedIcon: Int = 0) : CustomTabEntity {

    override fun getTabTitle() = title

    override fun getTabSelectedIcon() = selectedIcon

    override fun getTabUnselectedIcon() = unSelectedIcon

}