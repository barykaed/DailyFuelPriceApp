package com.kishorebabu.android.dailyfuelprice.injection.component

import com.kishorebabu.android.dailyfuelprice.features.base.BaseActivity
import com.kishorebabu.android.dailyfuelprice.features.main.MainActivity
import com.kishorebabu.android.dailyfuelprice.injection.PerActivity
import com.kishorebabu.android.dailyfuelprice.injection.module.ActivityModule
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(baseActivity: BaseActivity)

    fun inject(mainActivity: MainActivity)
}
