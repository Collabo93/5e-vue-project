<template>
    <nav class="navbar">
        <div class="container">
            <ul class="nav">
                <li class="nav-item">
                    <router-link
                        active-class="active"
                        exact
                        :to="{ name: 'home' }"
                    >
                        Home
                    </router-link>
                </li>
                <li class="nav-item">
                    <router-link
                        active-class="active"
                        exact
                        :to="{ name: 'login' }"
                    >
                        Login
                    </router-link>
                </li>
                <li class="nav-item">
                    <router-link
                        active-class="active"
                        exact
                        :to="{ name: 'register' }"
                    >
                        Register
                    </router-link>
                </li>
                <li class="nav-item rightfloat">
                    <router-link
                        active-class="active"
                        exact
                        :to="{ name: 'about' }"
                    >
                        About
                    </router-link>
                </li>
            </ul>
        </div>
    </nav>
</template>

<script>
export default {
  name: "RwvHeader"
};
</script>

<style>
.navbar{
    width:100%;
}
ul.nav{
    list-style-type: none;
    margin:0;
    padding:0px;
    overflow: hidden;
    background-color: #333;
    width:100%;
}
ul.nav li{
    float: left;
}
ul.nav li.rightfloat{
    float:right;
    right:0;
}
ul.nav li a{
    text-decoration: none;
    display:inline-block;
    color:white;
    text-align: center;
    padding: 14px 16px;
}
ul.nav li a:hover{
    background-color:#4CAF50;
}
</style>