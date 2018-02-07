/*
 * Copyright (c) 2018  zhouhaoo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.zhouhaoo.sample.injection.module

import com.zhouhaoo.common.injection.ActivityScope
import com.zhouhaoo.sample.MainContract
import com.zhouhaoo.sample.MainModel
import dagger.Module
import dagger.Provides

/**
 * Created by zhou on 18/2/6.
 */
@Module
class MainModule(private var view: MainContract.View) {

    @ActivityScope
    @Provides
    internal fun provideUserView(): MainContract.View {
        return this.view
    }

    @ActivityScope
    @Provides
    internal fun provideUserModel(model: MainModel): MainContract.Model {
        return model
    }
}