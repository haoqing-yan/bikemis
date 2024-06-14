<template>
  <div>
    <h1>Parts Info Management</h1>
    <form @submit.prevent="handleSubmit">
      <div>
        <label for="name">Name:</label>
        <input v-model="part.name" id="name" required>
      </div>
      <div>
        <label for="type">Type:</label>
        <select v-model="part.type" id="type">
          <option disabled value="">Please select one</option>
          <option>WHEEL</option>
          <option>SEAT</option>
          <option>HANDLEBAR</option>
          <option>FRAME</option>
        </select>
      </div>
      <div>
        <label for="brand">Brand:</label>
        <input v-model="part.brand" id="brand">
      </div>
      <button type="submit">Submit</button>
    </form>

    <ul>
      <li v-for="item in parts" :key="item.id">
        {{ item.name }} - {{ item.type }} - {{ item.brand }}
        <button @click="deletePart(item.id)">Delete</button>
      </li>
    </ul>
  </div>
</template>

<script>
import { ref } from 'vue';
import partsInfoApi from '../api/partsInfoApi';

export default {
  setup() {
    const parts = ref([]);
    const part = ref({
      name: '',
      type: '',
      brand: ''
    });

    function handleSubmit() {
      // This would be replaced by an API call
      const newPart = { ...part.value, id: parts.value.length + 1 };
      parts.value.push(newPart);
      part.value = { name: '', type: '', brand: '' };  // Reset the form
    }

    function deletePart(id) {
      parts.value = parts.value.filter(p => p.id !== id);
    }
    const fetchParts = async () => {  // 添加 async 关键字
        try {
            const response = await partsInfoApi.getParts();
            parts.value = response.data;
            console.error(parts.value);
        } catch (error) {
            console.error('Failed to fetch parts:', error);
        }
    };
    fetchParts();

    return { parts, part, handleSubmit, deletePart };
  }
}


</script>
