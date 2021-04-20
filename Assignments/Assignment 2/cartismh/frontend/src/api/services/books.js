import authHeader, { BASE_URL, HTTP } from "../http";
import {saveFile} from "@/api/utils";

export default {
  allBooks() {
    return HTTP.get(BASE_URL + "/books", { headers: authHeader() }).then(
      (response) => {
        return response.data;
      }
    );
  },
  create(book) {
    return HTTP.post(BASE_URL + "/books", book, { headers: authHeader() }).then(
      (response) => {
        return response.data;
      }
    );
  },
  edit(book) {
    return HTTP.put(BASE_URL + `/books/${book.id}`, book, { headers: authHeader() }).then(
      (response) => {
        return response.data;
      }
    );
  },
    delete(book) {
        return HTTP.delete(BASE_URL + `/books/${book.id}`, { headers: authHeader() }).then(
            (response) => {
                return response.data;
            }
        );
    },
  sell(book) {
    return HTTP.patch(BASE_URL + `/books/${book.id}`, null, { headers: authHeader() }).then(
        (response) => {
          return response.data;
        }
    );
  },
    generateCSV() {
        return HTTP.get(BASE_URL + "/books/export/CSV", { responseType:"blob", headers: authHeader() }).then(
            (response) => {
                saveFile("CSV", response);
            }
        );
    },
    generatePDF() {
        return HTTP.get(BASE_URL + "/books/export/PDF", { headers: authHeader() }).then(
            (response) => {
                return response.data;
            }
        );
    },
};

