import axios from 'axios';

// 创建 axios 实例
const apiClient = axios.create({
  baseURL: 'http://172.16.111.230:8098/api', // 你的 API 基础路径
  withCredentials: false, // 跨域请求时是否需要使用凭证
  headers: {
    Accept: 'application/json',
    'Content-Type': 'application/json'
  },
  timeout: 10000 // 请求超时时间
});

export default apiClient;
