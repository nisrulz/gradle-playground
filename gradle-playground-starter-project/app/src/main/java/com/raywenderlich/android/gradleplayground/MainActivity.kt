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

package com.raywenderlich.android.gradleplayground

import android.content.pm.ApplicationInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  private val TAG = javaClass.simpleName

  // A native method that is implemented by the 'native-lib' native library, which is packaged
  // with this application.
  external fun stringFromJNI(): String

  companion object {

    // Load the 'native-lib' library on application startup.
    init {
      System.loadLibrary("native-lib")
    }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Set the toolbar title
    supportActionBar?.title = getString(R.string.app_name)

    // Setup the on click listener
    btnLetsPlay.setOnClickListener {
      val textToDisplay = StringBuilder()
      textToDisplay.append("String from native code: ${stringFromJNI()}").append("\n\n")
      textToDisplay.append("Package name: $packageName").append("\n\n")
      textToDisplay.append("App version name string: ${BuildConfig.VERSION_NAME}").append("\n\n")
      textToDisplay.append("App version string: ${BuildConfig.VERSION_CODE}").append("\n\n")
      textToDisplay.append("App flavor: ${BuildConfig.FLAVOR}").append("\n\n")
      textToDisplay.append("App build type: ${BuildConfig.BUILD_TYPE}").append("\n\n")
      textToDisplay.append("Debuggable flag: ${checkAndroidDebuggableFlag()}").append("\n\n")

      // TODO: Append custom defined build variables to the textToDisplay

      textView.text = textToDisplay.toString()
    }
  }

  // Method to check the `debuggable` flag in build.gradle
  private fun checkAndroidDebuggableFlag() = ((applicationInfo.flags and ApplicationInfo
      .FLAG_DEBUGGABLE) != 0)
}