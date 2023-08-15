package com.abdul.notesapp.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//Step9: Create an application class for  hilt

@HiltAndroidApp
class NoteApplication : Application()