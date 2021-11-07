package com.anzid.annotation

/**
 * Generate public observer
 *
 * supported annotation:
 * @see PublicLiveData
 * @see PublicSharedFlow
 * @see PublicStateFlow
 *
 *
 * @sample, generated container:
 *   |     @file:AnzidGenerationCode(
 *   |         value = ["Generated by Anzid company", "com.anzid.codegeneration.ksp.public_observer.PublicObserverProcessor"],
 *   |         date = "Generated date: Mon Nov 08 00:16:14 MSK 2021"
 *   |     )
 *   |
 *   |     package com.example.codogen.ui.main
 *   |
 *   |     import com.anzid.annotation.AnzidGenerationCode
 *   |     import androidx.lifecycle.LiveData
 *   |     import kotlinx.coroutines.flow.SharedFlow
 *   |     import kotlinx.coroutines.flow.StateFlow
 *   |     import kotlinx.coroutines.flow.asSharedFlow
 *   |     import kotlinx.coroutines.flow.asStateFlow
 *   |
 *   |
 *   |     /**
 *   |      * @see MainViewModel._test
 *   |     */
 *   |     @Suppress("UNCHECKED_CAST")
 *   |     val MainViewModel.test : LiveData<kotlin.String>
 *   |         get() {
 *   |             val observerPrivate = javaClass.getDeclaredField("_test")
 *   |             observerPrivate.isAccessible = true
 *   |             val observer = observerPrivate.get(this)
 *   |
 *   |             return observer as LiveData<kotlin.String>
 *   |         }
 *   |
 *   |     /**
 *   |      * @see MainViewModel._mutableEventInternal2
 *   |     */
 *   |     @Suppress("UNCHECKED_CAST")
 *   |     val MainViewModel.mutableEventInternal2 : LiveData<kotlin.String>
 *   |         get() {
 *   |             val observerPrivate = javaClass.getDeclaredField("_mutableEventInternal2")
 *   |             observerPrivate.isAccessible = true
 *   |             val observer = observerPrivate.get(this)
 *   |
 *   |             return observer as LiveData<kotlin.String>
 *   |         }
 *   |
 *   |     /**
 *   |      * @see MainViewModel._mutableNull
 *   |     */
 *   |     @Suppress("UNCHECKED_CAST")
 *   |     val MainViewModel.mutableNull : StateFlow<kotlin.collections.List<kotlin.Unit?>>
 *   |         get() {
 *   |             val observerPrivate = javaClass.getDeclaredField("_mutableNull")
 *   |             observerPrivate.isAccessible = true
 *   |             val observer = observerPrivate.get(this)
 *   |
 *   |             return (observer as kotlinx.coroutines.flow.MutableStateFlow<kotlin.collections.List<kotlin.Unit?>>).asStateFlow()
 *   |         }
 *   |
 *   |     /**
 *   |      * @see MainViewModel._mutableEvent
 *   |     */
 *   |     @Suppress("UNCHECKED_CAST")
 *   |     val MainViewModel.mutableEvent : SharedFlow<Unit>
 *   |         get() {
 *   |             val observerPrivate = javaClass.getDeclaredField("_mutableEvent")
 *   |             observerPrivate.isAccessible = true
 *   |             val observer = observerPrivate.get(this)
 *   |
 *   |             return (observer as kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit>).asSharedFlow()
 *   |         }
 *   |
 *   |     /**
 *   |      * @see MainViewModel._mutableEventNull
 *   |     */
 *   |     @Suppress("UNCHECKED_CAST")
 *   |     internal val MainViewModel.mutableEventNull : SharedFlow<kotlin.Unit?>
 *   |         get() {
 *   |             val observerPrivate = javaClass.getDeclaredField("_mutableEventNull")
 *   |             observerPrivate.isAccessible = true
 *   |             val observer = observerPrivate.get(this)
 *   |
 *   |             return (observer as kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit?>).asSharedFlow()
 *   |         }
 */


@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class PublicLiveData(val isInternal: Boolean = false)

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class PublicSharedFlow(val isInternal: Boolean = false)

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class PublicStateFlow(val isInternal: Boolean = false)