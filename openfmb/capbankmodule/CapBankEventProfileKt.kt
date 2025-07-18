// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: capbankmodule/capbankmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.capbankmodule;

@kotlin.jvm.JvmName("-initializecapBankEventProfile")
public inline fun capBankEventProfile(block: openfmb.capbankmodule.CapBankEventProfileKt.Dsl.() -> kotlin.Unit): openfmb.capbankmodule.CapBankEventProfile =
  openfmb.capbankmodule.CapBankEventProfileKt.Dsl._create(openfmb.capbankmodule.CapBankEventProfile.newBuilder()).apply { block() }._build()
/**
 * ```
 * Cap bank status profile
 * ```
 *
 * Protobuf type `capbankmodule.CapBankEventProfile`
 */
public object CapBankEventProfileKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.capbankmodule.CapBankEventProfile.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.capbankmodule.CapBankEventProfile.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.capbankmodule.CapBankEventProfile = _builder.build()

    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.EventMessageInfo eventMessageInfo = 1 [(.uml.option_parent_message) = true];`
     */
    public var eventMessageInfo: openfmb.commonmodule.EventMessageInfo
      @JvmName("getEventMessageInfo")
      get() = _builder.getEventMessageInfo()
      @JvmName("setEventMessageInfo")
      set(value) {
        _builder.setEventMessageInfo(value)
      }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.EventMessageInfo eventMessageInfo = 1 [(.uml.option_parent_message) = true];`
     */
    public fun clearEventMessageInfo() {
      _builder.clearEventMessageInfo()
    }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.EventMessageInfo eventMessageInfo = 1 [(.uml.option_parent_message) = true];`
     * @return Whether the eventMessageInfo field is set.
     */
    public fun hasEventMessageInfo(): kotlin.Boolean {
      return _builder.hasEventMessageInfo()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.capbankmodule.CapBankEvent capBankEvent = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var capBankEvent: openfmb.capbankmodule.CapBankEvent
      @JvmName("getCapBankEvent")
      get() = _builder.getCapBankEvent()
      @JvmName("setCapBankEvent")
      set(value) {
        _builder.setCapBankEvent(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.capbankmodule.CapBankEvent capBankEvent = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearCapBankEvent() {
      _builder.clearCapBankEvent()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.capbankmodule.CapBankEvent capBankEvent = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the capBankEvent field is set.
     */
    public fun hasCapBankEvent(): kotlin.Boolean {
      return _builder.hasCapBankEvent()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.capbankmodule.CapBankSystem capBankSystem = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var capBankSystem: openfmb.capbankmodule.CapBankSystem
      @JvmName("getCapBankSystem")
      get() = _builder.getCapBankSystem()
      @JvmName("setCapBankSystem")
      set(value) {
        _builder.setCapBankSystem(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.capbankmodule.CapBankSystem capBankSystem = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearCapBankSystem() {
      _builder.clearCapBankSystem()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.capbankmodule.CapBankSystem capBankSystem = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the capBankSystem field is set.
     */
    public fun hasCapBankSystem(): kotlin.Boolean {
      return _builder.hasCapBankSystem()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.capbankmodule.CapBankEventProfile.copy(block: openfmb.capbankmodule.CapBankEventProfileKt.Dsl.() -> kotlin.Unit): openfmb.capbankmodule.CapBankEventProfile =
  openfmb.capbankmodule.CapBankEventProfileKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.capbankmodule.CapBankEventProfileOrBuilder.eventMessageInfoOrNull: openfmb.commonmodule.EventMessageInfo?
  get() = if (hasEventMessageInfo()) getEventMessageInfo() else null

public val openfmb.capbankmodule.CapBankEventProfileOrBuilder.capBankEventOrNull: openfmb.capbankmodule.CapBankEvent?
  get() = if (hasCapBankEvent()) getCapBankEvent() else null

public val openfmb.capbankmodule.CapBankEventProfileOrBuilder.capBankSystemOrNull: openfmb.capbankmodule.CapBankSystem?
  get() = if (hasCapBankSystem()) getCapBankSystem() else null

