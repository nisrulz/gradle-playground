/*
 * Copyright (c) 2018 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 * A holder of all the versions.
 */
object Versions {

  // Build Config
  const val minSDK = 14
  const val compileSDK = 27
  const val targetSDK = 27

  // App version
  const val appVersionCode = 1
  const val appVersionName = "1.0.0"

  // Plugins
  const val androidGradlePlugin = "3.1.3"

  // Kotlin
  const val kotlin = "1.2.50"

  // Support Lib
  // const val support = "27.1.1"
  // Comment above and uncomment below to cause conflict in dependency
  const val support = "26.0.1"
  const val constraintLayout = "1.1.0"

  // Testing
  const val junit = "4.12"
  const val espresso = "3.0.2"
  const val testRunner = "1.0.2"

}

/**
 * A holder of all the dependencies required by the app.
 */
object Deps {

  // Plugins
  const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

  // Kotlin
  const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
  const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

  // Support Library
  const val appCompat = "com.android.support:appcompat-v7:${Versions.support}"
  const val supportAnnotations = "com.android.support:support-annotations:${Versions.support}"
  const val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"

  // Testing
  const val junit = "junit:junit:${Versions.junit}"
  const val espressoCore = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
  const val testRunner = "com.android.support.test:runner:${Versions.testRunner}"
}