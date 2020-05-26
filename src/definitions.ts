declare module "@capacitor/core" {
  interface PluginRegistry {
    CapacitorIntentResolver: CapacitorIntentResolverPlugin;
  }
}

export interface CapacitorIntentResolverPlugin {
  echo(options: { value: string }): Promise<{value: string}>;
}
