import { initializeApp } from "firebase/app";
import { getAuth, connectAuthEmulator } from "firebase/auth";
import { getFirestore, connectFirestoreEmulator } from "firebase/firestore";
import { getStorage, connectStorageEmulator } from "firebase/storage";

const firebaseConfig = {
  apiKey: "AIzaSyBh9ujtOk-DfMvt5yIFLBVmAaxEWnpoAno",
  authDomain: "ics3u-cadee.firebaseapp.com",
  projectId: "ics3u-cadee",
  storageBucket: "ics3u-cadee.appspot.com",
  messagingSenderId: "580501545880",
  appId: "1:580501545880:web:665528fb964e4d8b5ec1ed"
};

const app = initializeApp(firebaseConfig);

const auth = getAuth();
const firestore = getFirestore();
const storage = getStorage();

//connectAuthEmulator(auth, "http://localhost:9099");
//connectFirestoreEmulator(firestore, 'localhost', 8080);
//connectStorageEmulator(storage, "localhost", 9199);

export { auth, firestore, storage }