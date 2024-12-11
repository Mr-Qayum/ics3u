import { initializeApp } from "firebase/app";
import { getAuth } from "firebase/auth";
import { getFirestore } from "firebase/firestore";

// Paste your firebaseConfig from Firebase Console here
const firebaseConfig = {
  apiKey: "AIzaSyDRGXqEN8IR-fK7p9Cfz-4Ebe-h5zQbYRg",
  authDomain: "summative2-a2cc6.firebaseapp.com",
  projectId: "summative2-a2cc6",
  storageBucket: "summative2-a2cc6.firebasestorage.app",
  messagingSenderId: "385774553642",
  appId: "1:385774553642:web:c45849a1b7b8c96c275153"
};

const config = initializeApp(firebaseConfig)
const auth = getAuth(config);
const firestore = getFirestore(config);

export { auth, firestore };