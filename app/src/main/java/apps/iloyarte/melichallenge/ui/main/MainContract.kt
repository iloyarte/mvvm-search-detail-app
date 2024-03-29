package apps.iloyarte.melichallenge.ui.main

import apps.iloyarte.melichallenge.ui.base.BaseContract


class MainContract {

    interface View : BaseContract.View {
        fun showSearchFragment()
        fun showSearchResultsFragment(query: String)
    }

    interface Presenter : BaseContract.Presenter<View>
}