import { PolymerElement } from '@polymer/polymer/polymer-element.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';

class EmptyView extends PolymerElement {
  static get template() {
    return html`
      <style include="shared-styles">
        :host {
          display: block;
        }
      </style>

      <br/>
      Server View 1 with polymer template (no sleep)
		`;
  }

  static get is() {
    return 'empty-view';
  }

  static get properties() {
    return {
      // Declare your properties here.
    };
  }
}

customElements.define(EmptyView.is, EmptyView);
