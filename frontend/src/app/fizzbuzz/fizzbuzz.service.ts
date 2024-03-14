import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class FizzbuzzService{
  private apiServerUrl = 'http://localhost:8080'
  constructor(private http: HttpClient) {
  }

  public getResult(value: number): Observable<string>{
    return this.http.get<string>(`${this.apiServerUrl}/${value}`)
  }
}
