import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(private http: HttpClient) { }
  
  public getVideos() {
          return this.http.get("http://localhost:8080/Getall");
   }
   public getPhotos() {
    return this.http.get("http://localhost:8080/GetallPhotos");
}
  
}
