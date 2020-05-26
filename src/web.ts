import { WebPlugin } from '@capacitor/core';
import { CapacitorIntentResolverPlugin } from './definitions';

export class CapacitorIntentResolverWeb extends WebPlugin implements CapacitorIntentResolverPlugin {
  constructor() {
    super({
      name: 'CapacitorIntentResolver',
      platforms: ['web']
    });
  }

  async echo(options: { value: string }): Promise<{value: string}> {
    console.log('ECHO', options);
    return options;
  }
}

const CapacitorIntentResolver = new CapacitorIntentResolverWeb();

export { CapacitorIntentResolver };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(CapacitorIntentResolver);
