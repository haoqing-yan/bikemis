<template>
  <div id="app">
    <PartsInfoComponent/>
  </div>
</template>

<script>
import PartsInfoComponent from './components/PartsInfoComponent.vue'

export default {
  name: 'App',
  components: {
    PartsInfoComponent
  }
}
</script>


<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
