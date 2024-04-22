/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.gridcourses

import com.example.gridcourses.model.Course

object DataSource {
    val topics = listOf(
        Course(R.string.architecture, 58, R.drawable.architecture),
        Course(R.string.crafts, 121, R.drawable.crafts),
        Course(R.string.business, 78, R.drawable.business),
        Course(R.string.culinary, 118, R.drawable.culinary),
        Course(R.string.design, 423, R.drawable.design),
        Course(R.string.fashion, 92, R.drawable.fashion),
        Course(R.string.film, 165, R.drawable.film),
        Course(R.string.gaming, 37, R.drawable.gaming),
        Course(R.string.drawing, 326, R.drawable.drawing),
        Course(R.string.lifestyle, 305, R.drawable.lifestyle),
        Course(R.string.music, 212, R.drawable.music),
        Course(R.string.painting, 172, R.drawable.painting),
        Course(R.string.photography, 321, R.drawable.photography),
        Course(R.string.tech, 118, R.drawable.tech),
    )
}