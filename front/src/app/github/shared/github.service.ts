import { Injectable } from '@angular/core';
import { Http, URLSearchParams } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class GithubService {
  constructor(private http: Http) {}

  getOrg(org: string) {
    return this.makeRequest(`users`);
  }

  getReposForOrg(org: string) {
    return this.makeRequest(`users`);
  }

  getRepoForOrg(org: string, repo: string) {
    return this.makeRequest(`users`);
  }

  private makeRequest(path: string) {
    let url = `http://localhost:8080/api/${ path }`;
    return this.http.get(url)
      .map((res) => res.json());
  }
}
