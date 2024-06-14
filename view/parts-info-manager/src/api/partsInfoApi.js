import apiClient from './axios';

const endpoint = '/parts';

export default {
  getParts() {
    return apiClient.get(endpoint);
  },
  getPart(id) {
    return apiClient.get(`${endpoint}/${id}`);
  },
  createPart(part) {
    return apiClient.post(endpoint, part);
  },
  updatePart(id, part) {
    return apiClient.put(`${endpoint}/${id}`, part);
  },
  deletePart(id) {
    return apiClient.delete(`${endpoint}/${id}`);
  }
};
