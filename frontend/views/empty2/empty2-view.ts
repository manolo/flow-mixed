import {css, customElement, html, LitElement, query} from 'lit-element';
import * as service from '../../generated/Empty2Service';

@customElement('empty2-view')
export class Empty2ViewElement extends LitElement {
  static get styles() {
    return css`
      :host {
        display: block;
      }
    `;
  }

  @query('#msg') msg!: HTMLElement;

  render() {
    return html`
      <br />
      <button @click="${this.click}">Click </button>
      <div id="msg"></div>
    `;
  }

  async click() {
    this.msg.textContent = await String(service.hello('manolo'));
  }
}
