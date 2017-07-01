package com.kishorebabu.android.dailyfuelprice.injection


import com.kishorebabu.android.dailyfuelprice.injection.component.ConfigPersistentComponent
import javax.inject.Scope

/**
 * A scoping annotation to permit dependencies conform to the life of the
 * [ConfigPersistentComponent]
 */
@Scope @Retention annotation class ConfigPersistent