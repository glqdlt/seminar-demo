import {Injectable} from '@angular/core';
import {Http} from "@angular/http";
import {Observable} from "rxjs/Observable";

@Injectable()
export class SupportService {


  apiUrl = 'http://127.0.0.1:8080/greeting/';
  private message;

  constructor(public http: Http) {
    this.message = '';
  }


  sendMsg(message) {

    console.log(this.apiUrl);
    return this.http.post(this.apiUrl, message).subscribe(res => {
      alert(res.text())
    }, err => {
      alert('Server is Die!! '+ err)
    });

  }
}
