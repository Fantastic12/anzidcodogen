# Anzidcodogen
[![](https://jitpack.io/v/haizerdev/anzidcodogen.svg)](https://jitpack.io/#haizerdev/anzidcodogen)

Annotation proccessor for generate public observers(KSP implementation)

KSP integration doc - https://github.com/google/ksp/blob/main/docs/quickstart.md

Supported annotation PublicSharedFlow, PublicLiveData, PublicStateFlow

Example:

![image](https://user-images.githubusercontent.com/46586567/135762439-e910d9ec-f226-4013-a3f7-76a333c95bdd.png)

![image](https://user-images.githubusercontent.com/46586567/135758163-657b2a5a-19bb-49b4-a1e3-a2b0378895b8.png)


Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
	    repositories {
		maven { url 'https://jitpack.io' }
	    }
	}
  Step 2. Add the dependency

	dependencies {
	     implementation 'com.github.haizerdev:anzidcodogen:1.0-beta01'
	     ksp 'com.github.haizerdev:anzidcodogen:1.0-beta01'
	}
	
Step 3. Please add the Kotlin-generated files folder to your source set. 
This is done via sourceSets block in your module’s build.gradle. 
The srcDir is the path to which the files were generated which was indicated by the kapt.kotlin.generated option.
If you do not add this block, you’ll be flagged by a method not found error message in the IDE.

    android {
      ...
         sourceSets {
              applicationVariants.all { variant ->
                  getByName(variant.name) {
                      java.srcDirs += "${buildDir.absolutePath}/generated/ksp/${variant.name}/kotlin"
                  }
              }
         }
    }


Example generated container: 
    
         @file:AnzidGenerationCode(
            value = ["Generated by Anzid company", "com.anzid.codegeneration.ksp.public_observer.PublicObserverProcessor"],
            date = "Generated date: Mon Nov 08 00:16:14 MSK 2021"
         )
    
         package com.example.codogen.ui.main
    
         import com.anzid.annotation.AnzidGenerationCode
         import androidx.lifecycle.LiveData
         import kotlinx.coroutines.flow.SharedFlow
         import kotlinx.coroutines.flow.StateFlow
         import kotlinx.coroutines.flow.asSharedFlow
         import kotlinx.coroutines.flow.asStateFlow
    
    
         /**
          * @see MainViewModel._test
         */
         @Suppress("UNCHECKED_CAST")
         val MainViewModel.test : LiveData<kotlin.String>
             get() {
                 val observerPrivate = javaClass.getDeclaredField("_test")
                 observerPrivate.isAccessible = true
                 val observer = observerPrivate.get(this)
    
                 return observer as LiveData<kotlin.String>
             }
    
         /**
          * @see MainViewModel._mutableEventInternal2
         */
         @Suppress("UNCHECKED_CAST")
         val MainViewModel.mutableEventInternal2 : LiveData<kotlin.String>
             get() {
                 val observerPrivate = javaClass.getDeclaredField("_mutableEventInternal2")
                 observerPrivate.isAccessible = true
                 val observer = observerPrivate.get(this)
    
                 return observer as LiveData<kotlin.String>
             }
    
         /**
          * @see MainViewModel._mutableNull
         */
         @Suppress("UNCHECKED_CAST")
         val MainViewModel.mutableNull : StateFlow<kotlin.collections.List<kotlin.Unit?>>
             get() {
                 val observerPrivate = javaClass.getDeclaredField("_mutableNull")
                 observerPrivate.isAccessible = true
                 val observer = observerPrivate.get(this)
    
                 return (observer as kotlinx.coroutines.flow.MutableStateFlow<kotlin.collections.List<kotlin.Unit?>>).asStateFlow()
             }
    
         /**
          * @see MainViewModel._mutableEvent
         */
         @Suppress("UNCHECKED_CAST")
         val MainViewModel.mutableEvent : SharedFlow<Unit>
             get() {
                 val observerPrivate = javaClass.getDeclaredField("_mutableEvent")
                 observerPrivate.isAccessible = true
                 val observer = observerPrivate.get(this)
    
                 return (observer as kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit>).asSharedFlow()
             }
    
         /**
          * @see MainViewModel._mutableEventNull
         */
         @Suppress("UNCHECKED_CAST")
         internal val MainViewModel.mutableEventNull : SharedFlow<kotlin.Unit?>
             get() {
                 val observerPrivate = javaClass.getDeclaredField("_mutableEventNull")
                 observerPrivate.isAccessible = true
                 val observer = observerPrivate.get(this)
    
                 return (observer as kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit?>).asSharedFlow()
             }

