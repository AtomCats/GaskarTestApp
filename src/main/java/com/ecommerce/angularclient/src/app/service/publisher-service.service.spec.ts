import { TestBed } from '@angular/core/testing';

import { PublisherServiceService } from './publisher-service.service';

describe('PublisherServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PublisherServiceService = TestBed.get(PublisherServiceService);
    expect(service).toBeTruthy();
  });
});
