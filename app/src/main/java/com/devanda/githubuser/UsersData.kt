package com.devanda.githubuser

object UsersData {
    private val userUsername = arrayOf(
            "JakeWharton",
            "amitshekhariitbhu",
            "romainguy",
            "chrisbanes",
            "tipsy",
            "ravi8x",
            "jasoet",
            "budioktaviyan",
            "hendisantika",
            "sidiqpermana"
    )

    private val userName = arrayOf(
            "Jake Wharton",
            "AMIT SHEKHAR",
            "Romain Guy",
            "Chris Banes",
            "David",
            "Ravi Tamada",
            "Deny Prasetyo",
            "Budi Oktaviyan",
            "Hendi Santika",
            "Sidiq Permana"
    )

    private val userAvatar = intArrayOf(
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user3,
            R.drawable.user4,
            R.drawable.user5,
            R.drawable.user6,
            R.drawable.user7,
            R.drawable.user8,
            R.drawable.user9,
            R.drawable.user10
    )

    private val userCompany = arrayOf(
            "Google, Inc.",
            "@MindOrksOpenSource",
            "Google",
            "@google working on @android",
            "Working Group Two",
            "AndroidHive | Droid5",
            "@gojek-engineering",
            "@KotlinID",
            "@JVMDeveloperID @KotlinID @IDDevOps",
            "Nusantara Beta Studio"
    )

    private val userLocation = arrayOf(
            "Pittsburgh, PA, USA",
            "New Delhi, India",
            "California",
            "Sydney, Australia",
            "Trondheim, Norway",
            "India",
            "Kotagede, Yogyakarta, Indonesia",
            "Jakarta, Indonesia",
            "Bojongsoang, Bandung, Jawa Barat",
            "Jakarta, Indonesia"
    )

    private val userRepository = arrayOf(
            102,
            37,
            9,
            30,
            56,
            28,
            44,
            110,
            1064,
            65
    )

    private val userFollower = arrayOf(
            56995,
            5153,
            7972,
            14725,
            788,
            18628,
            277,
            178,
            428,
            465
    )

    private val userFollowing = arrayOf(
            12,
            2,
            0,
            1,
            0,
            3,
            39,
            23,
            61,
            10
    )

    val listData: ArrayList<User>
        get() {
            val list = arrayListOf<User>()
            for (index in userUsername.indices){
                val user = User()
                user.username = userUsername[index]
                user.name = userName[index]
                user.avatar = userAvatar[index]
                user.company = userCompany[index]
                user.location = userLocation[index]
                user.repository = userRepository[index]
                user.follower = userFollower[index]
                user.following = userFollowing[index]
                list.add(user)
            }
            return list
        }
}