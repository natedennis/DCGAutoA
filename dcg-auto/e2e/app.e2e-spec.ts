import { DcgAutoPage } from './app.po';

describe('dcg-auto App', function() {
  let page: DcgAutoPage;

  beforeEach(() => {
    page = new DcgAutoPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
